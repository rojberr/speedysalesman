import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PathfinderService {
  apiUrl = 'https://speedysalesman.herokuapp.com/pathfinder/greedy';

  constructor(private http: HttpClient) {}

  /**
   * Post the data in format:
   * #amount
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
  generateData(numberOfGenerated: number) {
    return this.http.post(this.apiUrl + '/generate', numberOfGenerated);
  }
}
