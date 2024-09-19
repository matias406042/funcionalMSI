import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Producto } from '../Models/producto';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  private apiUrl = 'http://localhost:8080/api/products';

  constructor(private http: HttpClient) { }

  crearProducto(producto: Producto): Observable<Producto> {
    return this.http.post<Producto>(this.apiUrl, producto);
  }
}
