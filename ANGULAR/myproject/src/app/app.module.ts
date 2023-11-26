import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';


@NgModule({
    declarations: [
      AppComponent,
      ProductComponent,
    ],
    imports: [],
    exports:[],
    bootstrap: [AppComponent]
})
export class AppModule { }