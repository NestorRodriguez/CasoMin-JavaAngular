import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { DialogService } from '../services/dialog/dialog.service';
import { LoadingService } from '../services/loading/loading.service';
import { Router } from '@angular/router';
import { RegisterService } from './register.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  name: String;
  email: String;
  password: String;
  user;
  rol;
  loading$ = this.loader.loading$;
  data;
  roles: any ;
  

  constructor(
    public registerService : RegisterService,
    public loader: LoadingService,
    public dialogbox: DialogService,
    public dialog: MatDialog,
    public router:Router
  ) { }

  ngOnInit(): void {
    this.registerService.getRol().subscribe(
      (rol)=>{
        this.roles = rol;
      });
  }

  register(){
    const usuario = {
      nombre: this.name,
      mail: this.email, 
      password: this.password,
      rol: {
        "id":this.rol,
        "descripcion":""
      }
    };
    this.roles.forEach(element => {
      if(element.id == this.rol){
        usuario.rol = element;
      }
    });
    this.user = this.registerService.register(usuario).subscribe(
      data => {
        this.user = data;
        if( data.id ==0 ){
          this.data= {tittle : "Mensaje", message : "Usted ya se encuentra registrado en el sistema"};
          this.dialogbox.dialogBox(this.data.message);
        }
        else{
          this.data= {tittle : "Mensaje", message : "Usuario registrado con éxito, por favor, inicie sesión"};
          this.dialogbox.dialogBox(this.data.message);
          this.router.navigateByUrl('/login'); 
        }
        this.email="";
        this.password="";
        this.name="";
        this.rol=0;
      }
    )
  } 
}
