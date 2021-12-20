import heapq


def dijkstra(n, num_of_nodes):
    # n : start node
    pq = [[0, n]]
    d = [INF for _ in range(num_of_nodes)]
    while pq:
        distance, current = heapq.heappop(pq)
        if d[current] < distance:
            continue

        for i in range(num_of_nodes):
            if distance + g[current][i] < d[i]:
                d[i] = distance + g[current][i]
                heapq.heappush(pq, [distance + g[current][i], i])

    return d


if __name__ == "__main__":

    INF = int(1e9)
    g = [
        [0, 2, 5, 1, INF, INF],
        [2, 0, 3, 2, INF, INF],
        [5, 3, 0, 3, 1, 5],
        [1, 2, 3, 0, 1, INF],
        [INF, INF, 1, 1, 0, 2],
        [INF, INF, 5, INF, 2, 0],
    ]
    ret = dijkstra(0, len(g))
    print(ret)
