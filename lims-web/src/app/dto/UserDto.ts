export class UserDto {
  id: number;
  name: string;
  surname: string;
  userName: string;
  password: string;
  constructor(name: string, surname: string) {
    this.name = name;
    this.surname = surname;
  }
  fullName(): string{
    return this.name + ' ' + this.surname;
  }
}
