import DateTimeFormat = Intl.DateTimeFormat;

export class Task {
    private _id: number;
    private _name: string;
    private _completed: boolean;
    private _dueDate: Date;


    constructor(id: number, name: string, completed: boolean, dueDate: Date) {
        this._id = id;
        this._name = name;
        this._completed = completed;
        this._dueDate = dueDate;
    }


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

    get dueDate(): Date {
        return this._dueDate;
    }

    set dueDate(value: Date) {
        this._dueDate = value;
    }
}
