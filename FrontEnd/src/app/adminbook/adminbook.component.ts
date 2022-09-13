import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { BookingService } from '../shared/booking.service';
import { BookModel } from './adminbook.model';

@Component({
  selector: 'app-adminbook',
  templateUrl: './adminbook.component.html',
  styleUrls: ['./adminbook.component.css']
})
export class AdminbookComponent implements OnInit {

  formValue!: FormGroup;
  bookModelObj : BookModel = new BookModel();
  bookData! : any;
  showAdd!: boolean;
  showUpdate!: boolean;
  constructor(private formbuilder: FormBuilder,
    private booking : BookingService) { }
  

  ngOnInit(): void {
    this.formValue = this.formbuilder.group({
      id : [''],
      customerName : [''],
      flightName : [''],
      flightNumber :[''],
      seatNumber :[''],
      fromLocation :[''],
      toLocation :[''],
      date :['']

      
    })
    this.getAllBook();
  }
  clickAddBook(){
    this.formValue.reset();
    this.showAdd = true;
    this.showUpdate = false;
  }
  postBookDetails(){
    this.bookModelObj.id = this.formValue.value.id;
    this.bookModelObj.customerName = this.formValue.value.customerName;
    this.bookModelObj.flightName = this.formValue.value.flightName;
    this.bookModelObj.flightNumber = this.formValue.value.flightNumber;
    this.bookModelObj.seatNumber = this.formValue.value.seatNumber;
    this.bookModelObj.fromLocation = this.formValue.value.fromLocation;
    this.bookModelObj.toLocation = this.formValue.value.toLocation;
    this.bookModelObj.date = this.formValue.value.date;
    
  
    this.booking.postBook(this.bookModelObj)
    .subscribe(res=>{
      console.log(res);
      alert("Something went wrong")
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllBook();
    },
    err=>{
      alert("Booking Added SuccessFully")
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllBook(); 
    })
  }
  getAllBook(){
    this.booking.getBook()
    .subscribe(res=>{
      this.bookData = res;

    })
  }
  deleteBook(row : any){
    this.booking.deleteBook(row.id)
    .subscribe(res=>{
      alert("Booking Deleted");
      this.getAllBook();
    })
  }
  onEdit(row: any){
    this.showAdd = false;
    this.showUpdate = true;
    this.bookModelObj.id = row.id;
    this.formValue.controls['id'].setValue(row.id);
    this.formValue.controls['customerName'].setValue(row.customerName);
    this.formValue.controls['flightName'].setValue(row.flightName);
    this.formValue.controls['flightNumber'].setValue(row.flightNumber);
    this.formValue.controls['seatNumber'].setValue(row.seatNumber);
    this.formValue.controls['fromLocation'].setValue(row.fromLocation);
    this.formValue.controls['toLocation'].setValue(row.toLocation);
    this.formValue.controls['date'].setValue(row.date);
    
  }
  updateBookDetails(){
    this.bookModelObj.id = this.formValue.value.id;
    this.bookModelObj.customerName = this.formValue.value.customerName;
    this.bookModelObj.flightName = this.formValue.value.flightName;
    this.bookModelObj.flightNumber = this.formValue.value.flightNumber;
    this.bookModelObj.seatNumber = this.formValue.value.seatNumber;
    this.bookModelObj.fromLocation = this.formValue.value.fromLocation;
    this.bookModelObj.toLocation = this.formValue.value.toLocation;
    this.bookModelObj.date = this.formValue.value.date;
    

    this.booking.updateBook(this.bookModelObj,this.bookModelObj.id)
    .subscribe(res=>{
      alert("updated Successfully");
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllBook();
    })
  
  }

}
