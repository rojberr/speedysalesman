import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PathfinderService {
  greedyURL = 'https://speedysalesman-api.herokuapp.com/pathfinder/greedy';
  antURL = 'https://speedysalesman-api.herokuapp.com/pathfinder/ant';
  generateURL = 'https://speedysalesman-api.herokuapp.com/pathfinder/generate';

  constructor(private http: HttpClient) {}

  /**
   * Post the data in format:
   * #amount
   * 1 x y
   * 2 x y
   * ...
   */
  postGreedyPath(data: any) {
    return this.http.post(this.greedyURL, data, { responseType: 'text' });
  }

  postAntPath(data: any) {
    return this.http.post(this.antURL, data, { responseType: 'text' });
  }

  /**
   * Send request to generate the data
   */
  generateData(numberOfGenerated: number) {
    return this.http.post(this.generateURL, numberOfGenerated);
  }
}
