import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PathfinderService {
  apiUrl = 'https://speedysalesman-api.herokuapp.com/pathfinder';

  constructor(private http: HttpClient) {}

  /**
   * Post the data in format:
   * amount
   * 1 x y
   * 2 x y
   * ...
   */
  postData(data: any) {
    return this.http.post(this.apiUrl, data, { responseType: 'text' });
  }

  /**
   * Send request to generate the data
   */
  generateData() {
    return this.http.get(this.apiUrl + '/generate');
  }
}
