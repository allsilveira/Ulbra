import { CreateUserDto } from "../../domain/user/dtos/CreateUserDto";
import { UpdateUserDto } from "../../domain/user/dtos/UpdateUserDto";
import { User } from "../../domain/user/model/User";
import { IUserRepository } from "../../domain/ports/IUserRepository";

export class UserLocalRepository implements IUserRepository {
    private users: User[] = [
    ]

    async create(dto: CreateUserDto): Promise<User> {
        this.users.push(dto)

        const { email, password } = dto;
        return new User(email, password)
    }
    async read(): Promise<User[]> {
        return this.users;
    }
    async update(id: number, dto: UpdateUserDto): Promise<User> {
        const user = this.users[id - 1];
        const { email, password } = dto;

        Object.assign(user, {
            email,
            password
        });
        this.users.push(user);

        return new User(user.email, user.password);
    }
    async delete(id: number): Promise<void> {
        this.users.splice((id - 1), 1);
    }
}