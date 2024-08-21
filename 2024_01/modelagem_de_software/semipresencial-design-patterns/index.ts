import { CreateUserDto } from "./domain/user/dtos/CreateUserDto";
import { UserFactory } from "./domain/user/UserFactory";

const { userService } = new UserFactory().execute();

async function main() {
    const dto: CreateUserDto = {
        email: 'desenvolvedor@gmai.com',
        password: '12345678'
    }

    const [newUser, users] = await Promise.all([
        userService.create(dto),
        userService.read()
    ])

    console.log('new user', newUser);
    console.log('users', users);
}
main();
