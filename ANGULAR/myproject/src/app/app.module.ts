import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { UserComponent } from './user/user.component';


@NgModule({
    declarations: [
      AppComponent,
      ProductComponent,
      UserComponent
    ],
    imports: [],
    exports:[],
    bootstrap: [AppComponent]
})
export class AppModule { }