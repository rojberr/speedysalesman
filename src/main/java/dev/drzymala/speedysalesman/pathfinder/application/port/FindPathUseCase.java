package dev.drzymala.speedysalesman.pathfinder.application.port;

import dev.drzymala.speedysalesman.commons.Either;

public interface FindPathUseCase<T> {

    FoundPathResponse findPath(String data);

    class FoundPathResponse<T> extends Either<String, Object> {

        public FoundPathResponse(boolean success, String left, Object right) {
            super(success, left, right);
        }

        public static FoundPathResponse success(Object result) {

            return new FoundPathResponse(true, null, result);
        }

        public static FoundPathResponse failure(String error) {

            return new FoundPathResponse(false, error, null);
        }
    }
}
