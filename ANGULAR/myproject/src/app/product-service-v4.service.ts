import { Injectable } from '@angular/core';
import { ProductV4 } from './model/product-v4';

import { Observable, map } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',

})
export class ProductServiceV4 {

  private apiUrl = 'https://dummyjson.com/products';
  public httpClient: HttpClient;

  products!: ProductV4[];

  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  getAllProducts = (): Observable<ProductV4[]> => {
    return this.httpClient.get<{ products: ProductV4[] }>(this.apiUrl).pipe(map(response => response.products));
  }

  getProduct(id: string): Observable<ProductV4> {
    return this.httpClient.get<ProductV4>(this.apiUrl + "/" + id);
  }

}
