import { Injectable } from '@angular/core';
import { Observable } from '../../../node_modules/rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PessoaService {

  //aqui vai ser nossa URL da página que vamos criar
  //aqui podemos colocar aquele endpoint no mocky
  private baseUrl = 'http://localhost:8080/api/v1/pessoas';

  //httpClient é alguém que pode chamar alguma coisa via protocolo HTTP
  constructor(private http: HttpClient) { }

  // Read
  getPessoas(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  // Read
  getPessoa(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  // Create
  createPessoa(pessoa: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, pessoa);
  }

  // Update
  updatePessoa(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  // Delete
  deletePessoa(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, {responseType: `text`});
  }
}
