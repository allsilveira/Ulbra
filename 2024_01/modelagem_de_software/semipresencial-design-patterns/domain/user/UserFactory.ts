import { UserLocalRepository } from "../../infra/database/UserLocalRepository";
import { IFactory } from "../shared/interfaces/IFactory";
import { UserService } from "./UserService";

export class UserFactory implements IFactory {
    execute() {
        const userRepository = new UserLocalRepository();
        const userService = new UserService(userRepository);

        return ({
            userRepository,
            userService
        });
    }
}