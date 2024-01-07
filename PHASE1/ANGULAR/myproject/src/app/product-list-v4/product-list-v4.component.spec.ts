import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductListV4Component } from './product-list-v4.component';

describe('ProductListV4Component', () => {
  let component: ProductListV4Component;
  let fixture: ComponentFixture<ProductListV4Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductListV4Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ProductListV4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
