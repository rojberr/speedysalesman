package dev.drzymala.speedysalesman.pathfinder.application.port;

import dev.drzymala.speedysalesman.commons.Either;

import java.util.List;

public interface AntServiceUseCase<T> {

    OptimalPathResponse findPath(String data);

    class OptimalPathResponse<T> extends Either<String, Object> {

        public OptimalPathResponse(boolean success, String left, Object right) {
            super(success, left, right);
        }

        public static OptimalPathResponse success(Object result) {

            return new OptimalPathResponse(true, null, result);
        }

        public static OptimalPathResponse failure(String error) {

            return new OptimalPathResponse(false, error, null);
        }
    }
}
