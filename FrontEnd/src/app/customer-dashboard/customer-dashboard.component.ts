import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup} from '@angular/forms';
import { ApiService } from '../shared/api.service';
import { CustomerModel } from './customer-dash board.model';

@Component({
  selector: 'app-customer-dashboard',
  templateUrl: './customer-dashboard.component.html',
  styleUrls: ['./customer-dashboard.component.css']
})
export class CustomerDashboardComponent implements OnInit {

  formValue!: FormGroup;
  customerModelObj : CustomerModel = new CustomerModel();
  customerData! : any;
  showAdd!: boolean;
  showUpdate!: boolean;
  constructor(private formbuilder: FormBuilder,
    private api : ApiService) { }
  

  ngOnInit(): void {
    this.formValue = this.formbuilder.group({
      id : [''],
      customerName : [''],
      address :[''],
      mobileNumber :[''],
      email :['']
    })
    this.getAllCustomer();
  }
  clickAddCustomer(){
    this.formValue.reset();
    this.showAdd = true;
    this.showUpdate = false;
  }
  postCustomerDetails(){
    this.customerModelObj.id = this.formValue.value.id;
    this.customerModelObj.customerName = this.formValue.value.customerName;
    this.customerModelObj.address = this.formValue.value.address;
    this.customerModelObj.mobileNumber = this.formValue.value.mobileNumber;
    this.customerModelObj.email = this.formValue.value.email;
  
    this.api.postCustomer(this.customerModelObj)
    .subscribe(err=>{
      alert("something went wrong")
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllCustomer();
  
    },
    res=>{
      alert("customer added successfully")
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllCustomer();
    })
  
  }
  getAllCustomer(){
    this.api.getCustomer()
    .subscribe(res=>{
      this.customerData = res;

    })
  }
  deleteCustomer(row : any){
    this.api.deleteCustomer(row.id)
    .subscribe((res: any)=>{
      alert("Customer Id Deleted");
      this.getAllCustomer();
    })
  }
  onEdit(row: any){
    this.showAdd = false;
    this.showUpdate = true;
    this.customerModelObj.id = row.id;
    this.formValue.controls['id'].setValue(row.id);
    this.formValue.controls['customerName'].setValue(row.customerName);
    this.formValue.controls['address'].setValue(row.address);
    this.formValue.controls['mobileNumber'].setValue(row.mobileNumber);
    this.formValue.controls['email'].setValue(row.email);

  }
  updateCustomerDetails(){
    this.customerModelObj.id = this.formValue.value.id;
    this.customerModelObj.customerName = this.formValue.value.customerName;
    this.customerModelObj.address = this.formValue.value.address;
    this.customerModelObj.mobileNumber = this.formValue.value.mobileNumber;
    this.customerModelObj.email = this.formValue.value.email;

    this.api.updateCustomer(this.customerModelObj,this.customerModelObj.id)
    .subscribe(res=>{
      alert("updated Successfully");
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllCustomer();
    })
  
  }
}

