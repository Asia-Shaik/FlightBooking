import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup} from '@angular/forms'
import { FlightService } from '../shared/flight.service';
import { ApiService } from '../shared/api.service';
import { FlightModel } from './flight-dash board.model';

@Component({
  selector: 'app-flight-dashboard',
  templateUrl: './flight-dashboard.component.html',
  styleUrls: ['./flight-dashboard.component.css']
})
export class FlightDashboardComponent implements OnInit {

  formValue!: FormGroup<any>;
  flightModelObj : FlightModel = new FlightModel();
  flightData! : any;
  showAdd!: boolean;
  showUpdate!: boolean;
  
  constructor(private formbuilder: FormBuilder,
    private flight : FlightService) { }
  

  ngOnInit(): void {
    this.formValue = this.formbuilder.group({
      id : [''],
      flightName : [''],
      flightCharge : [''],
      flightNumber :[''],
      fromLocation : [''],
      toLocation : [''],
      date : ['']
      
    })
    this.getAllFlight();
  }
  clickAddFlight(){
    this.formValue.reset();
    this.showAdd = true;
    this.showUpdate = false;
  }
  postFlightDetails(){
    this.flightModelObj.id = this.formValue.value.id;
    this.flightModelObj.flightName = this.formValue.value.flightName;
    this.flightModelObj.flightCharge = this.formValue.value.flightCharge;
    this.flightModelObj.flightNumber = this.formValue.value.flightNumber;
    this.flightModelObj.fromLocation = this.formValue.value.fromLocation;
    this.flightModelObj.toLocation = this.formValue.value.toLocation;
    this.flightModelObj.date = this.formValue.value.date;
    
    this.flight.postFlight(this.flightModelObj)
    .subscribe(res=>{
      console.log(res);
      alert("flight added successfully")
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllFlight();
    },
    err=>{
      alert("something went wrong");
      
    })
  }
  getAllFlight(){
    this.flight.getFlight()
    .subscribe(res=>{
      this.flightData = res;

    })
  }
  deleteFlight(row : any){
    this.flight.deleteFlight(row.id)
    .subscribe((res:any)=>{
      alert("Flight Deleted");
      this.getAllFlight();
    })
  }
  onEdit(row: any){
    this.showAdd = false;
    this.showUpdate = true;
    this.flightModelObj.id = row.id;
    this.formValue.controls['id'].setValue(row.id);
    this.formValue.controls['flightName'].setValue(row.flightName);
    this.formValue.controls['flightCharge'].setValue(row.flightCharge);
    this.formValue.controls['flightNumber'].setValue(row.flightNumber);
    this.formValue.controls['fromLocation'].setValue(row.fromLocation);
    this.formValue.controls['toLocation'].setValue(row.toLocation);
    this.formValue.controls['date'].setValue(row.date);
    

  }
  updateFlightDetails(){
    this.flightModelObj.id = this.formValue.value.id;
    this.flightModelObj.flightName = this.formValue.value.flightName;
    this.flightModelObj.flightCharge = this.formValue.value.flightCharge;
    this.flightModelObj.flightNumber = this.formValue.value.flightNumber;
    this.flightModelObj.fromLocation = this.formValue.value.fromLocation;
    this.flightModelObj.toLocation = this.formValue.value.toLocation;
    this.flightModelObj.date = this.formValue.value.date;
    
    this.flight.updateFlight(this.flightModelObj,this.flightModelObj.id)
    .subscribe(res=>{
      alert("updated Successfully");
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllFlight();
    })
  
  }

}
