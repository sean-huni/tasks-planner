import {Component, OnInit} from '@angular/core';
import {Task} from "../../../model/taks.model";
import {TaskService} from "../../../services/task.service";

@Component({
    selector: 'app-task-list',
    templateUrl: './task-list.component.html',
    styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {
    private _tasks: Task[] = [];

    constructor(private taskService: TaskService) {
    }

    ngOnInit() {
        // this.tasks.push(new Task(1, "Task One", true, new Date(2019, 2, 24)));
        // this.tasks.push(new Task(2, "Task Two", false, new Date(2019, 2, 27)));
        // this.tasks.push(new Task(3, "Task Three", false, new Date(2019, 2, 28)));
        return this.taskService.getTasks().subscribe(
            resp => {
                this.tasks = JSON.parse(JSON.stringify(resp));
            },error1 => console.error(error1)
        );
    }

    getDueDateLabel(task: Task){
        return task.completed ? 'label-success' : 'label-primary';
    }

    onTaskChange(event, task: Task){
       console.log("Task changed...");
        task.completed = event.target.checked;
        this.taskService.updateTask(task).subscribe();
    }

    /* *****************
     * Getter & Setters
     * *****************
     */
    get tasks(): Task[] {
        return this._tasks;
    }

    set tasks(value: Task[]) {
        this._tasks = value;
    }
}
