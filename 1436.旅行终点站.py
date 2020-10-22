class Solution(object):
    def destCity(self, paths):
        """
        :type paths: List[List[str]]
        :rtype: str
        """
        allCities = set()
        beginCities = set()

        for path in paths:
            allCities.add(path[0])
            allCities.add(path[1])
            beginCities.add(path[0])
        return (allCities-beginCities).pop()
