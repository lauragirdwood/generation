import { Component, OnInit } from '@angular/core';
import { Observable } from '../../../node_modules/rxjs';
import { Pessoa } from 'src/app/pessoa';
import { PessoaService } from '../pessoa-service/pessoa.service';
import { Router } from '../../../node_modules/@angular/router';

@Component({
  selector: 'app-pessoa-list',
  templateUrl: './pessoa-list.component.html',
  styleUrls: ['./pessoa-list.component.css']
})
export class PessoaListComponent implements OnInit {

  pessoas: Observable<Pessoa[]>;

  constructor(private pessoaService: PessoaService, private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData(){
    this.pessoas = this.pessoaService.getPessoas();
  }

  deletePessoa(id: number){
    this.pessoaService.deletePessoa(id)
    .subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log(error)
    );
  }

  // aqui se eu recebesse outra coisa que não o id aqui nesse parametro,
  // eu poderia mapear no meu path da app-routing-module com ele 
  pessoaDetails(id: number) {
    this.router.navigate(['details', id]);
  }


}
