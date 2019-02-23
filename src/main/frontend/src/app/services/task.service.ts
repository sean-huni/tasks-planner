import {EventEmitter, Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Task} from "../model/taks.model";

@Injectable({
    providedIn: 'root'
})
export class TaskService {
    private url: string = '/api/v1/tasks/';
    private _onTaskAdded = new EventEmitter<Task>();

    constructor(private httpClient: HttpClient) {
    }

    get onTaskAdded(): EventEmitter<Task> {
        return this._onTaskAdded;
    }

    set onTaskAdded(value: EventEmitter<Task>) {
        this._onTaskAdded = value;
    }

    public updateTask(task: Task) {
        const headers = new HttpHeaders({
            'Content-Type': 'application/json'
        });
        return this.httpClient.put(this.url, JSON.stringify(task), {headers: headers});
    }

    public getTasks() {
        return this.httpClient.get(this.url);
    }

    public addTask(task: Task) {
        const headers = new HttpHeaders({
            'Content-Type': 'application/json'
        });
        const req = JSON.stringify(task).replace(new RegExp('_', 'g'), ''); //remove unwanted underscores.
        return this.httpClient.post(this.url, req, {headers: headers});
    }
}
