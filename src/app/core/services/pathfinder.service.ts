import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class PathfinderService {
  url = 'http://localhost:8080/pathfinder';

  constructor(private http: HttpClient) {}

  post(data: any) {
    return this.http.post(this.url, data);
  }
}
