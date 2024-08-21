import { IUserRepository } from "../ports/IUserRepository";
import { CreateUserDto } from "./dtos/CreateUserDto";
import { UpdateUserDto } from "./dtos/UpdateUserDto";

export class UserService {
    constructor(
        private readonly repository: IUserRepository
    ) { }

    async create(dto: CreateUserDto) {
        return await this.repository.create(dto);
    }

    async read() {
        return await this.repository.read();
    }

    async update(id: number, dto: UpdateUserDto) {
        return await this.repository.update(id, dto);
    }

    async delete(id: number) {
        return await this.repository.delete(id);
    }
}