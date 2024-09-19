import { Injectable } from '@angular/core';
import { Inventario } from '../models/inventario';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InventarioService {

  producto: Inventario[] = [];

  private apiUrl = 'http://localhost:8080/products/products';

  constructor(private http: HttpClient) {}

  getAll(): Observable<Inventario[]> {
    return this.http.get<Inventario[]>(this.apiUrl);
  }

  deleteLast() {
    this.producto.pop();
  }

  delete(index: number) {
    this.producto.splice(index, 1);
  }

  add(match: Inventario) {
    this.producto.push(match);
  }
}
