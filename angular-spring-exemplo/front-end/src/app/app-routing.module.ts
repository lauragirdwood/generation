import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PessoaListComponent } from './pessoa-list/pessoa-list.component';
import { PessoaDetailsComponent } from './pessoa-details/pessoa-details.component';
import { PessoaCreateComponent } from './pessoa-create/pessoa-create.component';


const routes: Routes = [
  // quando n tem nada no path, nesse caso que tá em branco é a página inicial 
  // to mapeando com os nomes da classe que criamos no typescript
  {path: '', redirectTo: '/pessoa', pathMatch: 'full'},
  {path: 'pessoas', component: PessoaListComponent},
  {path: 'pessoas', component: PessoaCreateComponent},
  {path: 'details/:id', component: PessoaDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
