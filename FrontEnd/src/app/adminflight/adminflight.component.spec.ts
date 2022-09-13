import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminFlightComponent } from './adminflight.component';

describe('AdminflightComponent', () => {
  let component: AdminFlightComponent;
  let fixture: ComponentFixture<AdminFlightComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminFlightComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminFlightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
