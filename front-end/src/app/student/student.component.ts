import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  students:any;

  // constructor(private http:HttpClient) { }

  // ngOnInit(): void {
  //   let response = this.http.get("http://localhost:8080/getStudentList");
  //   response.subscribe((data)=>this.students=data);
  // }

  constructor(private service:StudentService) { }

  ngOnInit(): void {
    this.service.getStudents().subscribe(data=>this.students=data);
  }

}
