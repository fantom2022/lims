import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestProgrammComponent } from './test-programm.component';

describe('TestProgrammComponent', () => {
  let component: TestProgrammComponent;
  let fixture: ComponentFixture<TestProgrammComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestProgrammComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TestProgrammComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
