import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  
  constructor(private http : HttpClient) { }

  postCustomer(data:any){
    return this.http.post<any>("http://localhost:8090/customer/addCustomer", data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }
  getCustomer(){
    return this.http.get<any>("http://localhost:8090/customer/findAllCustomers")
    .pipe(map((res:any)=>{
    return res;
  }))
  }
  updateCustomer(data:any, id:number){
    return this.http.put<any>("http://localhost:8090/customer/update/"+id,data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }
  deleteCustomer(id:number){
    return this.http.delete<any>("http://localhost:8090/customer/delete/"+id)
    .pipe(map((res:any)=>{
      return res;
    }))
  }
}
