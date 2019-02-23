import {Component, OnInit} from '@angular/core';
import {Task} from "../../../model/taks.model";
import {TaskService} from "../../../services/task.service";

@Component({
    selector: 'app-task-add',
    templateUrl: './task-add.component.html',
    styleUrls: ['./task-add.component.css']
})
export class TaskAddComponent implements OnInit {
    private addTaskValue: string = null;

    constructor(private taskService: TaskService) {
    }

    ngOnInit() {
    }

    onTaskAdd(event) {
        let task: Task = new Task(event.target.value, false, new Date());

        this.taskService.addTask(task).subscribe(
            resp => {
                let newTask: Task = JSON.parse(JSON.stringify(resp));
                this.addTaskValue = '';
                this.taskService.onTaskAdded.emit(newTask);
            }, error1 => console.error(error1)
        );
    }
}
