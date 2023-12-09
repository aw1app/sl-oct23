import { TestBed } from '@angular/core/testing';

import { ProductServiceV4Service } from './product-service-v4.service';

describe('ProductServiceV4Service', () => {
  let service: ProductServiceV4Service;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductServiceV4Service);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
