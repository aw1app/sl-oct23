import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule } from "@angular/forms";
import { AppComponent } from './app.component';

import { ProductComponent } from './product/product.component';
import { UserComponent } from './user/user.component';
import { ProductV2Component } from './product-v2/product-v2.component';
//import { ProductlistComponent } from './productlist/productlist.component';
import { ProductService } from './product.service';
import { ProductV3Component } from './product-v3/product-v3.component';
import { ProductlistV3Component } from './productlist-v3/productlist-v3.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ProductComponentV4 } from './product-component-v4/product-component-v4.component';
import { ProductListV4Component } from './product-list-v4/product-list-v4.component';
import { ProductServiceV4 } from './product-service-v4.service';
import { RouterModule,Router, provideRouter, withComponentInputBinding } from '@angular/router';
import { routes } from './app.routes';
import { NoSuchComponent } from './no-such/no-such.component';

@NgModule({
    declarations: [
      AppComponent,
      ProductComponent,
      ProductV2Component,
      UserComponent,
      //ProductlistComponent,
      ProductV3Component,
      ProductlistV3Component,
      AddproductComponent,
      ProductComponentV4,
      ProductListV4Component,
      NoSuchComponent
    ],
    providers:[ProductService,ProductServiceV4, provideRouter(routes, withComponentInputBinding())],
    imports: [FormsModule,BrowserModule,HttpClientModule,ReactiveFormsModule, RouterModule.forRoot(routes) ],
    exports:[RouterModule],
    bootstrap: [AppComponent]
})
export class AppModule { }