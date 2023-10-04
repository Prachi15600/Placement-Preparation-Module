class MyHashMap:

    def __init__(self):
        self.d = dict()

    def put(self, key: int, value: int) -> None:
        self.d[key] = value

    def get(self, key: int) -> int:
        return self.d[key] if key in self.d else -1

    def remove(self, key: int) -> None:
        self.d = {a : self.d[a] for a in self.d if a != key}