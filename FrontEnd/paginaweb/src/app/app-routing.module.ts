import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { PostComponent } from './post/post.component';
import { PublishSharedComponent } from './publish-shared/publish-shared.component';
import { PublishComponent } from './publish/publish.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  {path:'', redirectTo: '/login', pathMatch: 'full'},
  {path:'post', component: PostComponent},
  {path:'login', component:LoginComponent},
  {path:'register', component:RegisterComponent},
  {path:'publish', component:PublishComponent},
  {path:'publish-shared', component:PublishSharedComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
