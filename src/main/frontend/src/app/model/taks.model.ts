import {formatDate} from "@angular/common";

export class Task {
    private _id: number;
    private _name: string;
    private _completed: boolean;

    constructor(name: string, completed: boolean, dueDate: Date) {
        this._name = name;
        this._completed = completed;
        this._dueDate = formatDate(dueDate, 'dd/MM/yyyy', 'en-GB');
    }

    private _dueDate: string;


    get id(): number {
        return this._id;
    }

    set id(value: number) {
        this._id = value;
    }

    get name(): string {
        return this._name;
    }

    set name(value: string) {
        this._name = value;
    }

    get completed(): boolean {
        return this._completed;
    }

    set completed(value: boolean) {
        this._completed = value;
    }

    get dueDate(): string {
        return this._dueDate;
    }

    set dueDate(value: string) {
        this._dueDate = formatDate(value, 'dd/MM/yyyy', 'en-GB');
    }
}
