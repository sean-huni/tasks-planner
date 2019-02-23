import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Task} from "../model/taks.model";
import {parseHttpResponse} from "selenium-webdriver/http";

@Injectable({
    providedIn: 'root'
})
export class TaskService {
    private url: string = '/api/v1/tasks/';

    constructor(private httpClient: HttpClient) {
    }

    updateTask(task: Task) {
        const headers = new HttpHeaders({
            'Content-Type': 'application/json'
        });
        return this.httpClient.put("/api/v1/tasks", JSON.stringify(task),{headers: headers});
    }

    getTasks(){
        return this.httpClient.get(this.url);
    }
}
