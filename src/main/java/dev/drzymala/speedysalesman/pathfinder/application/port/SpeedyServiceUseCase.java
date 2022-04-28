package dev.drzymala.speedysalesman.pathfinder.application.port;

import dev.drzymala.speedysalesman.commons.Either;

import java.util.List;

public interface SpeedyServiceUseCase<T> {

    FindPathResponse findPath(String data);

    List<T> generate(int size);

    class FindPathResponse<T> extends Either<String, List<T>> {
        public FindPathResponse(boolean success, String left, List<T> right) {
            super(success, left, right);
        }

        public static FindPathResponse success(List list) {
            return new FindPathResponse(true, null, list);
        }

        public static FindPathResponse failure(String error) {
            return new FindPathResponse(false, error, null);
        }
    }
}
