import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdminComponent } from './admin/admin.component';
import { AdminbookComponent } from './adminbook/adminbook.component';
import { AdminFlightComponent } from './adminflight/adminflight.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { BookingDashboardComponent } from './booking-dashboard/booking-dashboard.component';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';


import { DashboardComponent } from './dashboard/dashboard.component';
import { FlightDashboardComponent } from './flight-dashboard/flight-dashboard.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';

import { PaymentComponent } from './payment/payment.component';
import { RegisterComponent } from './register/register.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {path:'',redirectTo:"home",pathMatch:'full'},
{path:'login' ,component:LoginComponent},
{path:'register',component:RegisterComponent},
  {path:'home',component:HomeComponent},
  {path: 'adminlogin',component:AdminloginComponent},
  {path:'dashboard',component:DashboardComponent},
  {path:'customer',component:CustomerDashboardComponent},
  {path:'flight',component:FlightDashboardComponent},
  {path:'book',component:BookingDashboardComponent},
  {path:'admin', component:AdminComponent},
  {path:'admin-flight', component:AdminFlightComponent},
  {path:'admin-book', component:AdminbookComponent},
  {path:'user', component:UserComponent},
  {path:'app-payment',component:PaymentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
