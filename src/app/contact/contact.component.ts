import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  name: any;
  email: any;
  message: any;

  constructor() { }

  ngOnInit(): void {
    // create api call
    // create the form based on api fields
  }

  submitForm() {
    const message = `My name is ${this.name}, 
                    My emails is ${this.email},
                    My message is ${this.message}`;
    // grab all the firlds and their values
    // const nameInput = document.querySelector('input[name=name]').value;
    alert(message);
  }
}
