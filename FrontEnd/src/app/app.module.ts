import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSliderModule } from '@angular/material/slider';
import {MatToolbarModule } from '@angular/material/toolbar';
import {MatButtonModule } from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
import {MatListModule} from '@angular/material/list';
import {MatCardModule} from '@angular/material/card';
import {MatCommonModule} from '@angular/material/core';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatDialogModule} from '@angular/material/dialog';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatDividerModule} from '@angular/material/divider';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatTabsModule} from '@angular/material/tabs';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { RegisterComponent } from './register/register.component';

import { DashboardComponent } from './dashboard/dashboard.component';

import { AdminComponent } from './admin/admin.component';

import { PaymentComponent } from './payment/payment.component';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';
import { FlightDashboardComponent } from './flight-dashboard/flight-dashboard.component';
import { BookingDashboardComponent } from './booking-dashboard/booking-dashboard.component';

import { AdminbookComponent } from './adminbook/adminbook.component';
import { AdminFlightComponent } from './adminflight/adminflight.component';
import { UserComponent } from './user/user.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';




@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    NavbarComponent,
    RegisterComponent,
    DashboardComponent,
    CustomerDashboardComponent,
    FlightDashboardComponent,
    BookingDashboardComponent,
    AdminComponent,
    PaymentComponent,
    AdminFlightComponent,
    AdminbookComponent,
    UserComponent,
    AdminloginComponent,
    
 
  
  
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatSliderModule,
    MatButtonModule,
    MatCardModule,
    MatToolbarModule,
    MatTabsModule,
    MatCheckboxModule,
    MatDividerModule,
    MatGridListModule,
    MatProgressBarModule,
    MatDialogModule,
    MatCommonModule,
    MatSidenavModule,
    MatListModule,
    MatSelectModule,
    MatFormFieldModule,
    MatIconModule,
    MatInputModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
 
  
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }