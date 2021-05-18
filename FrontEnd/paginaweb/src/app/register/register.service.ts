import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  serverUrlUsers='http://localhost:8082/api/usuario';
  serverUrlRol='http://localhost:8082/api/rol';

  constructor(public http: HttpClient) { }

  getRol():
  Observable<any> {
    return this.http.get<any[]>(this.serverUrlRol).pipe(
      tap(data => 
        console.log(JSON.stringify(data),
        )),
      catchError(this.handleError)
    );
  }

  register(user:any):
    Observable<any> {
      return this.http.post<any[]>(this.serverUrlUsers, user).pipe(
        tap(data => 
          console.log(JSON.stringify(data),
          )),
        catchError(this.handleError)
      );
    }

    private handleError(err: HttpErrorResponse) {
      let errorMessage = '';
      if (err.error instanceof ErrorEvent) {
        errorMessage = `An error ocurred ${err.error.message}`;
      } 
      else {
        errorMessage = `Server returned code: ${err.status}, error message is:   ${err.message}`;
      } 
      console.log(errorMessage);
      return throwError(errorMessage);
    }
}
