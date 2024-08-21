import { CreateUserDto } from "../user/dtos/CreateUserDto"
import { UpdateUserDto } from "../user/dtos/UpdateUserDto"
import { User } from "../user/model/User"

export interface IUserRepository {
    create(dto: CreateUserDto): Promise<User>
    read(): Promise<User[]>
    update(id: number, dto: UpdateUserDto): Promise<User>
    delete(id: number): Promise<void>
}