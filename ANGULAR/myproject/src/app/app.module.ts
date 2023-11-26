import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { UserComponent } from './user/user.component';
import { ProductV2Component } from './product-v2/product-v2.component';
import { ProductlistComponent } from './productlist/productlist.component';


@NgModule({
    declarations: [
      AppComponent,
      ProductComponent,
      ProductV2Component,
      UserComponent,
      ProductlistComponent
    ],
    imports: [],
    exports:[],
    bootstrap: [AppComponent]
})
export class AppModule { }