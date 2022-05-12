package dev.drzymala.speedysalesman.pathfinder.application.port;

import dev.drzymala.speedysalesman.commons.Either;

import java.util.List;

public interface SpeedyServiceUseCase<T> {

    FindPathResponse findPath(String data);

    List<T> generate(int size);

    class FindPathResponse<T> extends Either<String, Object> {

        public FindPathResponse(boolean success, String left, Object right) {
            super(success, left, right);
        }

        public static FindPathResponse success(Object result) {

            return new FindPathResponse(true, null, result);
        }

        public static FindPathResponse failure(String error) {

            return new FindPathResponse(false, error, null);
        }
    }
}
