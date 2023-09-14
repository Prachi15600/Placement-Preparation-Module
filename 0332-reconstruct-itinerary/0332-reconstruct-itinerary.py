class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        def dfs(current_airport):
            if len(itinerary) == len(tickets) + 1:
                return True

            if current_airport not in flight_map:
                return False

            destinations = flight_map[current_airport]
            for i, destination in enumerate(destinations):
                if not visited[current_airport][i]:
                    visited[current_airport][i] = True
                    itinerary.append(destination)
                    if dfs(destination):
                        return True
                    itinerary.pop()
                    visited[current_airport][i] = False

            return False

        flight_map = defaultdict(list)
        visited = defaultdict(list)
        itinerary = ["JFK"]

        for from_airport, to_airport in tickets:
            flight_map[from_airport].append(to_airport)
            visited[from_airport].append(False)

        for airport in flight_map:
            flight_map[airport].sort()

        dfs("JFK")
        return itinerary