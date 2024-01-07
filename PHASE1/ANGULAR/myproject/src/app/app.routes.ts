import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ProductListV4Component } from './product-list-v4/product-list-v4.component';
import { ProductComponentV4 } from './product-component-v4/product-component-v4.component';
import { NoSuchComponent } from './no-such/no-such.component';
import { AddproductComponent } from './addproduct/addproduct.component';

export const routes: Routes = [

    { path: 'home', component: AppComponent },
    { path: 'product-list', component: ProductListV4Component },
    { path: 'add-product', component: AddproductComponent },
    { path: 'product/:productId', component: ProductComponentV4 },
    { path: '*', component: NoSuchComponent },

];
