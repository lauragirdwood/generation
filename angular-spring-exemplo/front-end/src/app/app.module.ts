import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PessoaListComponent } from './pessoa-list/pessoa-list.component';
import { PessoaCreateComponent } from './pessoa-create/pessoa-create.component';
import { PessoaDetailsComponent } from './pessoa-details/pessoa-details.component';
import { HttpClientModule } from '../../node_modules/@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    PessoaListComponent,
    PessoaCreateComponent,
    PessoaDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
