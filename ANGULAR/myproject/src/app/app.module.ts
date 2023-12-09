import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { UserComponent } from './user/user.component';
import { ProductV2Component } from './product-v2/product-v2.component';
import { ProductlistComponent } from './productlist/productlist.component';

import {FormsModule } from "@angular/forms";
import { ProductService } from './product.service';
import { ProductV3Component } from './product-v3/product-v3.component';
import { ProductlistV3Component } from './productlist-v3/productlist-v3.component';

@NgModule({
    declarations: [
      AppComponent,
      ProductComponent,
      ProductV2Component,
      UserComponent,
      ProductlistComponent,
      ProductV3Component,
      ProductlistV3Component
    ],
    providers:[ProductService],
    imports: [FormsModule,BrowserModule],
    exports:[],
    bootstrap: [AppComponent]
})
export class AppModule { }