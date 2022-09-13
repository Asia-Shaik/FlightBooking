import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class BookingService {
  
  constructor(private http : HttpClient) { }

  postBook(data:any){
    return this.http.post<any>("http://localhost:8092/book/addBook", data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }
  getBook(){
    return this.http.get<any>("http://localhost:8092/book/findAllBooks")
    .pipe(map((res:any)=>{
    return res;
  }))
  }
  updateBook(data:any, id:number){
    return this.http.put<any>("http://localhost:8092/book/update/"+id,data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }
  deleteBook(id:number){
    return this.http.delete<any>("http://localhost:8092/book/delete/"+id)
    .pipe(map((res:any)=>{
      return res;
    }))
  }
}
