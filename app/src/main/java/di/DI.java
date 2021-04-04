package di;

import api.ApiMeetingService;
import api.FakeApiService;

public class DI {
    private static ApiMeetingService service = new FakeApiService();

    /**
     * Get an instance on @{@link ApiMeetingService}
     * @return
     */
    public static ApiMeetingService getApiMeetingService() {
        return service;
    }

    /**
     * Get always a new instance on @{@link ApiMeetingService}. Useful for tests, so we ensure the context is clean.
     * @return
     */
    public static ApiMeetingService getNewInstanceApiService() {
        return new FakeApiService();
    }

}
