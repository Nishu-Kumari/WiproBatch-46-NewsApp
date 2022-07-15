import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { AuthenticationModule } from './modules/authentication/authentication.module'
import { NewsModule } from './modules/news/news.module'
import { SharedModule } from './modules/shared/shared.module'

const appRoutes: Routes = [
  {
    path: '',
    redirectTo: '/news/top',
    pathMatch: 'full'
  }
]
@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    NewsModule,
    SharedModule,
    AuthenticationModule,
    RouterModule.forRoot(appRoutes),


  ],
  exports: [RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
